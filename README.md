# Website Monitoring

[![Java CI with Maven](https://github.com/dockermaster/WebsiteMonitoring/actions/workflows/maven.yml/badge.svg)](https://github.com/dockermaster/WebsiteMonitoring/actions/workflows/maven.yml)

This project is your simple solution to monitoring a website/url

Once a day you will get an email alert with the results of the monitoring bot.

Instructions:

###### Applitools Setup

1. Create a free [Applitools account](https://applitools.com)
2. Enable [email alerts](https://applitools.com/docs/features/batch-completion-email-integration.html)
3. grab your [APPLITOOLS_API_KEY](https://applitools.com/docs/topics/overview/obtain-api-key.html)

###### GitHug Setup

1. Fork this project
2. Enable Actions
3. Add 3 secrets ([3 simple steps](https://docs.github.com/en/actions/security-guides/encrypted-secrets))
  a. APPLITOOLS_API_KEY
  b. URL - the website you wish to monitor (e.g. http://www.github.com)
  c. TITLE - a name of what you're actually monitoring (e.g. product name, company name), this will appear in your email alert subject line

** You're all set **

