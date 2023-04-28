# patient_mvc
Gestionnaire de Patients pour un Hôpital
L'objectif principal de ce projet est de concevoir et développer une application Web JEE basée sur Spring MVC, Thymeleaf et Spring Data JPA 
pour gérer les patients d'un hôpital. L'application doit offrir aux utilisateurs la possibilité de visualiser, rechercher et supprimer des patients,
tout en prenant en compte les aspects de pagination pour une meilleure expérience utilisateur.

En plus des fonctionnalités de base, l'application doit également inclure des mesures de sécurité en intégrant un système d'authentification basé sur Spring Security.
Pour ce faire, les trois stratégies d'authentification suivantes doivent être mises en place : InMemoryAuthentication, JdbcAuthentication et UserDetailsService.

Fonctionnalités de l'application
L'application dispose des fonctionnalités suivantes:

Visualiser la liste des patients
Rechercher un patient par nom ou prénom
Supprimer un patient
Pagination pour une meilleure expérience utilisateur
Système d'authentification
L'application inclut un système d'authentification basé sur Spring Security et les trois stratégies d'authentification suivantes doivent être mises en place:

InMemoryAuthentication: Les informations d'authentification sont stockées en mémoire
JdbcAuthentication: Les informations d'authentification sont stockées dans une base de données
UserDetailsService: Les informations d'authentification sont récupérées à partir d'un service externe
Technologies utilisées
Spring MVC: Framework de développement Web pour Java
Thymeleaf: Moteur de templates pour la création de pages Web
Spring Data JPA: Bibliothèque de persistence pour l'interaction avec la base de données
Spring Security: Bibliothèque de sécurité pour les applications Spring
MySQL: Système de gestion de base de données relationnelle
************************************************
Comment lancer l'application
Cloner le dépôt Git en local
Importer le projet dans l'IDE de votre choix
Configurer la connexion à la base de données MySQL dans le fichier application.properties
reload le maven
Accéder à l'application à l'adresse http://localhost:8082
*************************************************
Conclusion
Ce projet permet de concevoir et développer une application Web JEE pour la gestion des patients d'un hôpital.
L'application inclut des fonctionnalités de base telles que la visualisation, la recherche et la suppression des patients, 
ainsi qu'un système d'authentification sécurisé en utilisant Spring Security et les trois stratégies d'authentification.
