
echo "================================"
echo "app start"

cd /home/sp_ricardo/Exercicios/workflow/autorization
mvn clean install

echo "start app service"

sudo ln -s /home/sp_ricardo/Exercicios/workflow/autorization/target/Flow-0.0.1-SNAPSHOT.jar /etc/init.d/Flow-0.0.1-SNAPSHOT	
sudo update-rc.d Flow-0.0.1-SNAPSHOT defaults
sudo service Flow-0.0.1-SNAPSHOT start

#sudo service nginx start

#java -jar /home/sp_ricardo/Exercicios/workflow/autorization/target/demo-0.0.1-SNAPSHOT.jar
