# CHALLENGE (Save the library, save the world)

 - Créer une BDD MySQL et initialiser un projet Spring communiquant avec celle-ci
 - Créer une entité Book ayant pour attributs title, author et description
 - Créer un BookRepository permettant de réaliser les 4 opérations CRUD + une opération de recherche par mot-clé contenu dans le titre ou la description
 - Mettre en place un controller répondant aux critères REST
 - Tester l'application dans Postman
 - Envoyer le projet vers son dépôt distant et partager le lien en solution
 
# Critères de validation

  Toutes les requêtes envoyées vers l'application Spring via Postman (verbes GET, POST, PUT et DELETE) fonctionnent et renvoient des réponses cohérentes
  
# Informations supplémentaires pour la correction

Nom de la base de données MySQL : springRest

Nom de l'utilisateur et mot de passe utilisé pour la base de données à saisir dans le fichier application.properties.

Pour la recherche par mot-clé, utiliser un JSON ayant pour clé "keyword": { "keyword": "mot-clé" }.

J'ai rajouté un dossier Postman dans le projet qui contient les captures d'écrans de 3 requêtes.
