# Java-Programming-II

Search Engine from the Javengers!

Περιγραφή λειτουργίας του προγράμματος

Για τη λειτουργία της μηχανής αναζήτησης είναι απαραίτητη η ύπαρξη μιας βάσης δεδομένων από 
έναν web crawler στην οποία θα συνδεθεί. Αφού επιτευχθεί η σύνδεση αυτή ανοίγουμε σειριακά 
τα HTML source αρχεία με την κατάλληλη μέθοδο και παίρνουμε το κείμενο της εκάστοτε ιστοθέσης.
Ακολουθεί η κανονικοποίηση του κειμένου, η αφαίρεση των stop words και η καταχώρηση του κειμένου 
σε πίνακα μέσω της μεθόδου split. Στη συνέχεια δημιουργείται το ευρετήριο/Index, δομημένο σε 
HashTable, το οποίο περιλαμβάνει όλα τα keywords αντιστοιχισμένα με ένα ArrayList που περιλαμβάνει
όλα τα url στα οποία εμφανίζονται και ένα αριθμό που αντιπροσωπεύει τη συχνότητα εμφάνισης του κάθε
keyword στο κάθε url. Αφού δημιουργηθεί το Index  αποθηκεύεται σε αρχείο txt, το οποίο διαβάζεται
και μετατρέπεται ξανά σε Map, όπως ήταν στην Index, από τον οποίο θα ανασυρθούν τα δεδομένα κατά 
την αναζήτηση. Για την αναζήτηση, ζητείται από το χρήστη να εισάγει ένα μονολεκτικό input,
το οποίο κανονικοποιείται και στη συνέχεια γίνεται η αναζήτηση του στο ευρετήριο και η εμφάνιση
των αποτελεσμάτων σε γραφικό περιβάλλον.

Εργαλεία που χρησιμοποιήθηκαν:

-Checkstyle

-Find Bugs 

-JUnit

-Maven

-Eclipse

Dependencies:

-JUnit

-jframe
 
Περιεχόμενα φακέλων:

src : περιέχει τις κλάσεις του προγράμματος  

test : περιέχει τα JUnit tests

MAVEN : περιέχει pom.xml , Effective-POM
