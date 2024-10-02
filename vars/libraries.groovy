def download(repo)
  {
    git 'https://github.com/Vikramduddu/${repo}.git
  }

def buildartifact()
  {
   sh 'mvn package'
  }
