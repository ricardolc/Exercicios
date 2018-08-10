#sudo apt-get update
#sudo apt-get -y install git
#git clone https://github.com/ricardolc/Exercicios.git
#ksh
#cd cd /home/sp_ricardo/Exercicios/workflow/autorization
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

echo "================================"
echo "app start"

cd /home/sp_ricardo/Exercicios/workflow/autorization
mvn clean install

echo "start app service"

sudo ln -s /home/sp_ricardo/Exercicios/workflow/autorization/target/demo-0.0.1-SNAPSHOT.jar /etc/init.d/demo-0.0.1-SNAPSHOT	
sudo update-rc.d demo-0.0.1-SNAPSHOT defaults
sudo service demo-0.0.1-SNAPSHOT start

#java -jar /home/sp_ricardo/Exercicios/workflow/autorization/target/demo-0.0.1-SNAPSHOT.jar
           
