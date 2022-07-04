[![Sonarcloud Status](https://sonarcloud.io/api/project_badges/measure?project=rastorius_exam3&metric=alert_status)](https://sonarcloud.io/dashboard?id=rastorius_exam3)

[![SonarCloud Coverage](https://sonarcloud.io/api/project_badges/measure?project=rastorius_exam3&metric=coverage)](https://sonarcloud.io/component_measures/metric/coverage/list?id=rastorius_exam3)

[![SonarCloud Bugs](https://sonarcloud.io/api/project_badges/measure?project=rastorius_exam3&metric=bugs)](https://sonarcloud.io/component_measures/metric/reliability_rating/list?id=rastorius_exam3)

[![SonarCloud Code Smells](https://sonarcloud.io/api/project_badges/measure?project=rastorius_exam3&metric=code_smells)](https://sonarcloud.io/component_measures/metric/code_smells/list?id=rastorius_exam3)

# Kata and requirements

You'll have to solve the infamous Tic Tac Toe kata - with some additional things.  
You'll have to implement everything using BDD+TDD double loop. And by everything, I mean the original bot vs bot CLI
interface, and an API (which is defined by you). The API must be deployed to the cloud of your choice.  
KATA - Setup phase:  
The kata can be done with all the automation you believe could be a helper to remove manual setup. For this reason,
you’re authorized to have initialization, or API test, or docker containerization script/s that let you start code on a
“boilerplate” in one click. The boiler plate can initialize your development environment and the project. The
boilerplate CAN’T inject code snippets relevant to solve your kata. The unique snippet you can inject into the
boilerplate is to create a src/dummy that expose a dummy and a test/dummy that has the unit test framework initialized
to fail the test with the dummy. The docker containerization and the API test suite can be injected as well in the
development lifecycle.  
Scoring System:

* The kata must be stored in GitHub. (IBM or public)
* The first push must be an empty directory
* The graduation has no time limit
* The code must be done in Solo mode (no pair, no mob)
* The code must be written during the graduation test (no copy & paste from past attempt)
    * Infrastructural things injected with init script are OK
* The repo must contain:
    * Notes for every pomodoro
    * Tech Debt
* The code must be 100% test covered. A few things that help you achieve that:
    * Unit test
    * Integration test
    * Testing the CLI interface
    * API test
    * Contract test
* The code must be developed using BDD+TDD double loop
* Boundaries tests around simple design & emerging architecture approach is a must
* Refactoring pillars [white & yellow belts]:
    * test suite and code as a book (DDD vocabulary)
    * code and test wording with a DDD vocabulary
    * code and test source as a book (hidden complexity)
    * code and test complexity under 4 cyclomatic
    * no linter or check style errors
    * no code smells
    * no DRY
* The code must have a continuous build pipeline (CB) [TravisCI, Jenkins, CircleCI, etc.]
* The CB on the last commit must be green (the test must be all green)
* The code must be analyzed from the following tools:
    * Linter (git quality gate)
    * Check style (git quality gate)
    * SonarQube/SonarCloud.io
    * [Optional] CodeScene.io
* The commit in GitHub must following a “Conventional Commits” approach blocking you to push on GitHub otherwise.
* The code must have a CI pipeline to test the executable and the api
* The code must be shipped on QA env for the showcase
* [OPT] The code shipped to the QA must be tested to ensure is working
  