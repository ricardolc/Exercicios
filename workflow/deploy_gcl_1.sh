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
echo "installing apache"

sudo apt-get -y install apache2

sudo a2enmod proxy
sudo a2enmod proxy_http
sudo a2enmod proxy_balancer
sudo a2enmod lbmethod_byrequests

echo "================================"
echo "copy 000-default.conf"
sudo cp 000-default.conf /etc/apache2/sites-enabled 

sudo /etc/init.d/apache2 restart

           
