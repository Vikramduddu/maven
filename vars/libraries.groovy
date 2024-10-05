def download(repo)
  {
    git "https://github.com/Vikramduddu/${repo}"
  }

def buildartifact()
  {
   sh "mvn package"
  }
def continuosdelivery(jobname,ip,context)
{
  sh " scp /var/lib/jenkins/workspace/${jobname}/target/webapp.war ubuntu@172.31.45.5:/var/lib/tomcat10/webapps/${context}.war"

