#!/usr/bin/env bash
#author   :lucasmorano
#usage    :sh ./create-changelog.sh
#=======================================
branch=$(git branch | sed -n -e 's/^\*\(.*\)/\1/p' | sed -e 's/feature\///' -e 's/hotfix\///' -e 's/release\///')
devopsTaskRegex='[0-9]+'
if [[ ${branch} =~ $devopsTaskRegex ]];

then
  current_timestamp=$(date +%s)
  file_name="${current_timestamp}-${branch## }.yaml"
  yaml_template="databaseChangeLog:
    - logicalFilePath: ${file_name}

    - changeSet:
        logicalFilePath: ${file_name}
        id: ${current_timestamp}-1
        author: $(git config user.name)
        comment: Template for a change-set using yaml
        changes:
          - sql:
              sql: >
                  SELECT 1 AS number;
          - tagDatabase:
              tag: ${branch## }
        rollback:
          - sql:
              sql: >
                  SELECT 1 AS number;
  "
  echo "${yaml_template}" > "$( cd "$(dirname "${BASH_SOURCE[0]}")" || exit ; pwd -P )/${file_name}"; echo "File template successfully created".
else
  echo "Error: Invalid branch. Use a valid task devops branch. ex: feature/212221"
fi