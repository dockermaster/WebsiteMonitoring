# Website Monitoring Bot

Once a day you will get an email alert with the results of the monitoring bot.

Instructions:

## Applitools Setup

1. Create a free [Applitools account](https://applitools.com)
2. Enable [email alerts](https://applitools.com/docs/features/batch-completion-email-integration.html)
3. grab your [APPLITOOLS_API_KEY](https://applitools.com/docs/topics/overview/obtain-api-key.html)

## GitHug Actions Setup

Click **Fork**

![Fork](https://user-images.githubusercontent.com/20506018/183772885-7d774432-a5ec-49c4-a070-ded0be3573c0.png)

Click **Create fork**

![Fork2](https://user-images.githubusercontent.com/20506018/183772989-faf82fc5-c99e-40e0-86f7-e72b507c1c57.png)

Goto **Actions**

![Actions1](https://user-images.githubusercontent.com/20506018/183773085-d3559338-366a-4a12-9f56-dd0cdd00e633.png)

Click **I understand...**

![Actions2](https://user-images.githubusercontent.com/20506018/183773126-afd65a28-4c92-4083-9e28-e00630f6e9da.png)

Navigate to **Website Monitoring** workflow

![Actions3](https://user-images.githubusercontent.com/20506018/183773192-9b12193e-78b3-4019-9e65-125bdd43107b.png)

Click **Enable workflow**

![Actions4](https://user-images.githubusercontent.com/20506018/183773234-8a1fdde9-cc42-4ac7-812a-0ac9cd3fea19.png)

Navigate to **Settings**

![Secrets0](https://user-images.githubusercontent.com/20506018/183773349-eb73907b-43ea-452e-9474-dade6fb03e3d.png)

Click on **Actions** (under the secrets section)

![Secrets1](https://user-images.githubusercontent.com/20506018/183773600-be470a02-4e91-4e05-acc3-65348a2a60a7.png)

Click on **New repository secret**

![Secrets2](https://user-images.githubusercontent.com/20506018/183773660-ce4ddcda-8e2c-4d18-bf84-ccaa501e50b6.png)

Enter **name** & **value** secrets and click **Add secret** (repeat this step for each of the variables below
  - **APPLITOOLS_API_KEY**
  - **URL** - the website you wish to monitor (e.g. http://www.github.com)
  - **TITLE** - a name of what you're actually monitoring (e.g. product name, company name)
  
![Secrets3](https://user-images.githubusercontent.com/20506018/183773719-43cb88cd-b731-48f8-83f3-57949e153163.png)

When you have all 3 secrets in you are all set!

![Secrets4](https://user-images.githubusercontent.com/20506018/183773899-823350f3-7b19-45d4-b05d-dc64dce3ab31.png)

Your bot will now run daily and send you email reports!

