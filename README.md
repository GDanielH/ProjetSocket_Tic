# ProjetSocket_Tic
fonctionnalité :
ip:localhost;
port:1-60000;

fonction loadimage:
maka ireo sary hoampiasaina,
raha sendra misy erreur amle resaka sary dia tsy hitan ilay projet ilay sary raha ts atao "build path" dia aveo atao oe "add class folder";

fonction Render:(fonction hoan ny modification eo amn frame)
  -raha toa ka deconnecte ny client dia manoratra oe tapaka ny connection
  -raha toa ka misy client tafiditra dia manambotra ny espace de jeu hoan ilay client (ilay affichage hoan client)
  -raha toa ka misy mandresy dia manoratra oe nandresy eo amn ilay nandresy ary manoratra oe resy eo amn ilay resy
  -raha egalite dia manoratra oe egalite
  -raha mbola tsis client d manoratra oe mbola tsis client
  
fonction run :
  -miantso ny fonction tick;
  -repaint
  -ar ra toa ka mbola tsis client dia miantso ny fonction listenforserverrequest
  
fonction Tick:
  - rehefa bdb ny erreur d tonga d deconnecte hoazy
  -sinon raha mbola false ny tour sy ny unableToCommunicateWithOpponent dia manambotra variable ahafahana mijery oe eo am case numero firy no hanoratana 
  ny X na O ,no sad mijery ra toa ka oe efa misy mandresy na egalite , no mmamadika ny tour ho true

fonction Checkwin:
mijery ftsn ra toa ka mandresy ilay joueur am tour any amn alalan fijerevana ny diagonale,horizontale,verticale oe anazy daholo ve ny eo amn iray amn ireo

fonction checkforenemywin:
mitovy amn checkwin fa amn cas oe ny an ny adversaire no jereny

fonction checkfortie:
mijery raha tsis toerana tson ilalaovana nefa mbola tsis nandresy dia considerer ho egalite

fonction listenForServerRequest:
mijery ra toa ka nisy client hiconnect dia sad acceptena

fonction connect:
mamorona ny socket dia maka ny ip sy port
sad miteny ra toa ka tafaconnect ny client amn serveur

fonction initializeServer:
ra mbola tsis serveur dia initialiser serveur vaovao

Painter:
manoratra eo am frame ny X sy ny O miankina amn tour;
