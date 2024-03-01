This repo is demo for Centralized configuration using "Spring Cloud Config Server".
- The configuration for client svcs is mentioned in another repo "https://github.com/p-suram/git-localconfig-repo.git"
- Config server is set to be run on port 8888
- In Config server aplication.properties file we are providing config git uri as "https://github.com/p-suram/git-localconfig-repo.git"
- In limits-service application.properties file we are mentioning to import config from "http://localhost:8888"

  <img width="452" alt="image" src="https://github.com/p-suram/microservices-centralized-config/assets/157307140/0c2f6011-a192-4da3-a3e1-6478c4787829">

