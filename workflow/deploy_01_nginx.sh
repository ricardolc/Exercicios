#sudo apt-get update
#sudo apt-get -y install git
#git clone https://github.com/ricardolc/Exercicios.git
#ksh
#cd /home/sp_ricardo/Exercicios/workflow
#sh deploy_gcl.sh

echo "================================"
echo "installing java default-jre"

sudo apt-get install -y openjdk-8-jdk

export JAVA_HOME="/usr/lib/jvm/java-8-openjdk-amd64"

export PATH=$JAVA_HOME/bin:$PATH

echo "================================"
echo "installing java maven"

sudo apt-get install -y maven

echo "================================"
echo "installing ngingx"

sudo apt-get -y install nginx

echo "================================"
echo "copy default"
sudo cp default /etc/nginx/sites-available 

sudo service nginx restart

           
