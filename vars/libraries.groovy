def download(repo)
  {
    git "https://github.com/Vikramduddu/${repo}"
  }

def buildartifact()
  {
   sh "mvn package"
  }
def delivery(jobname,ip,appname)
  {
     sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war   ubuntu@${ip}:/var/lib/tomcat10/webapps/${appname}.war"
  }

