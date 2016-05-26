# Prettauxvariable

sarah :
Lorsqu'un client de l'agence a réalisé des simulations de prêt avec son conseiller financier celles-ci ont été stockées. 
NB: ces simulations varient selon la valeur des paramètres renseignés et sur lesquelles le client a pu hésiter (durée du prêt, montant de l'emprunt ...). 
Le conseiller financier peut alors montrer au client une comparaison des différents scénarios pour l'aider à faire son choix final, sur l'instant ou plusieurs jours après sa visite initiale.
Cette comparaison doit montrer les écarts entre les volumes principaux (total des intérêts, ...) et mettre en évidence les avantages et inconvénients de chaque scénario (niveau d'endettement, poids de la mensualité dans le budget du client,...). Le tout sous forme de tableaux accompagnés si possible de graphiques.

Pour faire tourner ce Use Case vous pouvez éventuellement populer directement vos bases de données avec quelques scénarios simulés par vous-même. Dans ce cas vous n'aurez pas besoin d'utiliser les données stockées à l'issue du UC "Simuler un calcul de prêt à taux fixe". Toutefois vous baser sur ces données-là (ie enchainer les deux UC) constituerait un vrai plus. 

Aurelie :
Lorsqu'un client de l'agence souhaite contracter un prêt à taux variable le conseiller financier peut lui présenter différents scénarios d'évolutions de ce prêt au cours du temps. Ces évolutions sont dues à des mises à jour de l'indice de référence du taux d'intérêt qui impactent fortement les conditions du prêt (montant des intérêts,...). 
Il présentera des scénarios favorables au client et d'autres qui lui sont défavorables afin de lui permettre de comprendre les risques associés au choix d'un prêt à taux variable.

Jeremy :
Le directeur de l'agence lance un un calcul qui détermine quels sont les taux d'intérêt que l'agence peut proposer à ses clients. Ces taux dépendent de plusieurs paramètres.
Ils ont pour base les  taux de référence fixés par la maison mère mais le directeur de l'agence bénéficie d'une certaine marge et peut choisir de l'exploiter plus ou moins. 
Les taux varient en fonction de la durée du prêt demandé.
Enfin, les taux dépendent du niveau de risque associé à l'emprunteur (ie le risque pris par la banque que l'emprunteur s'avère défaillant en cours de prêt).  Ceci dépend des caractéristiques personnelles de l'emprunteur (son age, son état de santé, etc...).

Ulysse

 
Commentaires Partager
FichierÉditionAffichageInsertionFormatDonnéesOutilsModules complémentairesAideDernière modification il y a 7 jours par ulysse de villartay
     €%  123  Galdeano  
9
     
 
  
 
                    
Après avoir effectué un calcul de prêt le résultat en est affiché à travers plusieurs restitutions. 
Outre le rappel des paramètres et le tableau d'amortissement complet on affichera sous la forme de graphiques l'évolution sur la durée du prêt des données suivantes: capital restant à rembourser, et la part respective dans la mensualité du capital remboursé, des intérêts et de l'assurance.
Lors du mouseover sur les graphiques les données numériques propres à l'élément sélectionné s'affichent dans un petit popup.
L'affichage et l'impression se font en fonction de paramètres de pagination, l'ensemble des restitutions devant pouvoir être affichés de façon ergonomique.

Pour faire tourner ce Use Case vous pouvez éventuellement populer directement vos bases de données avec quelques scénarios simulés par vous-même. Dans ce cas vous n'aurez pas besoin d'utiliser les données stockées à l'issue du UC "Simuler un calcul de prêt à taux fixe". Toutefois vous baser sur ces données-là (ie enchainer les deux UC) constituerait un vrai plus. 
Pour activer la compatibilité avec le lecteur d'écran, appuyez sur raccourci Ctrl+Alt+Z. Pour connaître les raccourcis clavier, appuyez sur raccourci Ctrl+barre oblique.
 
 
 	  	JASSUR
 		
 

Après avoir effectué un calcul de prêt le résultat en est affiché à travers plusieurs restitutions. 
Outre le rappel des paramètres et le tableau d'amortissement complet on affichera sous la forme de graphiques l'évolution sur la durée du prêt des données suivantes: capital restant à rembourser, et la part respective dans la mensualité du capital remboursé, des intérêts et de l'assurance.
Lors du mouseover sur les graphiques les données numériques propres à l'élément sélectionné s'affichent dans un petit popup.
L'affichage et l'impression se font en fonction de paramètres de pagination, l'ensemble des restitutions devant pouvoir être affichés de façon ergonomique.

Pour faire tourner ce Use Case vous pouvez éventuellement populer directement vos bases de données avec quelques scénarios simulés par vous-même. Dans ce cas vous n'aurez pas besoin d'utiliser les données stockées à l'issue du UC "Simuler un calcul de prêt à taux fixe". Toutefois vous baser sur ces données-là (ie enchainer les deux UC) constituerait un vrai plus. 

 


Christophe
Le responsable de l'agence peut calculer et afficher de nombreux indicateurs tels que le nombre de prêts contractés ou simulés, la durée moyenne des prêts, la somme des intérêts perçus etc... (à vous de déterminer d'autres indicateurs).
Il pourra les décliner dynamiquement suivant plusieurs axes combinables: par type de prêt, par type de client, par période de temps (semaine, mois, année), etc...  Exemples:
  * somme des intérêts perçus au cours du mois passé, sur des prêts immobiliers contractés par des clients de moins de 35 ans
  * évolution semaine par semaine sur l'année en cours du nombre total de simulations effectuées au sein de l'agence

Ce Use Case nécessite de populer vos bases de données avec un certain volume de données simulées réalistes afin que le calcul des statistiques soit pertinent.

Romain :
Un client de l'agence (ou un prospect) souhaite réaliser des simulations de prêt à taux fixe. Le conseiller financier et le client déterminent l'ensemble des paramètres et caractéristiques du prêt (type de prêt, durée, taux, assurance,...). Dans le cas d'un prospect on devra au préalable renseigner ses informations personnelles (qui influencent notamment les taux proposables).
Puis le calcul est lancé et les résultats affichés.
Différents types de prêts sont possibles (consommation, immobilier, achet de véhicule, …) avec leurs spécificités.

Vous vous contenterez d'une restitution minimaliste du résultat de la simulation (tableaux de chiffres), les restitutions élaborées étant réalisées par le UC "Afficher sous forme graphique...".

Le résultat de la simulation est stocké et peut être rejoué ou modifié ultérieurement.
