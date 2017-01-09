package javengers;

import static org.junit.Assert.*;

import org.junit.Test;

public class GetTextTest {

	@Test
	public void testGetText() {
		GetText test = new GetText();
		String result = test.getText("C:\\Users\\sgavioti\\Desktop\\view-source_https___en.wikipedia.org_wiki_2016_San_Pablito_Market_fireworks_explosion.html");
		assertEquals(" 2016 San Pablito Market fireworks explosion - Wikipedia 				   On 20 December 2016, a  fireworks  explosion occurred at the San Pablito Market in the city of  Tultepec , north of  Mexico City .             At least 35 people were killed, and dozens injured.           Tultepec  has a major fireworks culture and industry,     with a two hundred year history of fireworks production.     About 65% of the population of the town is involved directly or indirectly in fireworks production.     According to the Instituto Mexiquense de la Pirotecnia, 436 fireworks workshops or retailers were registered in the Tultepec  municipality .     San Pablito Market is a major center for  Mexican handcrafted fireworks .     The city had implemented new safety measures in the market following firework-related explosions in 2005 and 2006.      The cause of the explosion is unknown, but sources preliminarily claimed that gunpowder from the fireworks ignited the explosion.     Up to 300tonnes of fireworks were reported to have been present at the market.     The explosion occurred at approximately 15:00  CST  (21:00  UTC ).     According to the  Edomex  Secretary of Government  José Manzur Quiroga , at least 32 people died,     with at least 59 more injured.     Of the dead, 26 died at the site of the explosion and six at the hospital.     Of the injured, 46 individuals were hospitalized, five of whom were in  critical condition .      Six children were among the injured, including a girl with burns to over 90% of her body.     Once they were stable and guardians had been contacted, these children were planned to be transferred to  Shriners Hospital for Children  in  Galveston, Texas , United States, to be treated.     Nearby homes were damaged significantly     and much of the market was leveled in the explosion.      José Manzur, representing the government of the  State of Mexico , stated that all funeral and medical bills of those killed and injured will be paid for by the government.     President  Enrique Peña Nieto  offered his condolences and ordered federal agencies to coordinate with state authorities to help the families of those affected, particularly in medical care.     Germán Galicia Cortes, the president of San Pablito Market, said that vendors would receive government assistance to help cover their losses, and pledged to re-open the market.     The office of the  federal attorney general  began an investigation into the incident, with forensic investigators deployed to the site on 21 December.     ", result);
		String result2 = test.getText("C:\\Users\\sgavioti\\Desktop\\view-source_euroleague.sport24.gr_article_4446331_o-olympiakos-exase-thn-eykairia.html");
		assertEquals("		 Ο Ολυμπιακός έχασε την ευκαιρία - Euroleague Greece | SPORT 24 								 Ο Ολυμπιακός τον τελευταίο μήνα είχε βρει ρυθμό στο παιχνίδι του, κάτι που αποτυπώθηκε στις τέσσερις σερί νίκες του στην EuroLeague, έχοντας επικρατήσει απέναντι σε Νταρουσάφακα εκτός, Ούνικς Καζάν εντός, Ζάλγκιρις στο Κάουνας και σε Ερυθρό Αστέρα στο ΣΕΦ. Το ματς στο Μπάμπεργκ ήταν το τελευταίο για το πέντε στα πέντε, ώστε οι Πειραιώτες να ολοκλήρωναν με τον καλύτερο δυνατό τρόπο το πρόγραμμα που είχαν μπροστά τους, με τους λεγόμενους υποδεέστερους αντιπάλους, πριν το σημαντικό και δύσκολο παιχνίδι κόντρα στην Φενέρμπαχτσε (29/12) στον Πειραιά. 								 Στην φετινή EuroLeague απαγορεύεται να υποτιμήσεις οποιονδήποτε αντίπαλο, αλλά κακά τα ψέμματα, υπάρχουν ματς που είσαι το φαβορί, που υπερτερείς, επειδή διαθέτεις μεγαλύτερη εμπειρία, προσωπικότητες παικτών, χημεία και ομοιογένεια, ισχύ σαν ομάδα, το... βάρος στην φανέλα. Θα λέγαμε και επειδή διαθέσεις βάθος στον πάγκο, αλλά είναι λογικό ο Ολυμπιακός να μην το διαθέτει αυτή την στιγμή, έχοντας νοκ-άουτ ταυτόχρονα το βασικό του 4άρι, τον Γιώργο Πρίντεζη και τον δεύτερο πλέι-μέικερ του, Ντάνιελ Χάκετ. Σε συνδυασμό με την κούραση και την έλλειψη ενέργειας, οι Πειραιώτες στο Μπάμπεργκ πραγματοποίησαν την χειρότερη τους φετινή εμφάνιση στην EuroLeague και γνώρισαν την ήττα από την γερμανική ομάδα. 								 Έχασε την ευκαιρία ο Ολυμπιακός να ανέβει ψηλότερα στην κατάταξη. Οι Πειραιώτες δεν... αξιοποίησαν το δώρο που τους έκανε ο Ερυθρός Αστέρας, ο οποίος νίκησε την Ρεάλ Μαδρίτης και αν η ομάδα του Γιάννη Σφαιρόπουλου είχε πάρει το διπλό στο Μπάμπεργκ τώρα θα ήταν μόνη δεύτερη με ρεκόρ 10-4, πίσω από την πρωτοπόρο ΤΣΣΚΑ (12-1). Τώρα είναι στο 9-5 και υπάρχει ενδεχόμενο για πενταπλή (!) ισοβαθμία στην τρίτη θέση, αν ο Παναθηναϊκός (8-5) νικήσει την Μπασκόνια (9-4) και η Φενέρμπαχτσε (8-5) την ΤΣΣΚΑ στην Μόσχα. Η σεζόν, όπως έχουμε πει, είναι μεγάλη, όλες οι ομάδες μπορούν να νικήσουν η μία την άλλη, τα ματς είναι συνεχόμενα και οι εναλλαγές στα συναισθήματα θα συνεχιστούν. Το ζητούμενο είναι η σωστή διαχείριση τους και ο κανόνας λέει: κανένας ενθουσιασμός ύστερα από νίκη, καμία απογοήτευση μετά από ήττα. Χαμένος βγαίνει όπως μένει στο προηγούμενο ματς και δεν κοιτά μπροστά. 								 Αυτό όμως που... ενόχλησε στο Μπάμπεργκ ήταν ο τρόπος. Προφανώς και ο Ολυμπιακός αγωνίστηκε δίχως το σημείο αναφοράς του μέσα στην ρακέτα και εκ των βασικών του σκόρερ, τον Γιώργο Πρίντεζη, παραμένει απώλεια το γεγονός πως ο Ντάνιελ Χάκετ βρίσκεται στα πιτς, καθώς πέρα ότι μπορεί να αλλάξει τον ρυθμό, η παρουσία του ήταν πολύτιμη στην περιφερειακή άμυνα (ο Κοζέρ έκανε... θραύση στο πρώτο ημίχρονο με 17 πόντους), αλλά το να αφήνεις τον αντίπαλο να επιβάλει τον ρυθμό του από την αρχή έως και το τέλος της αναμέτρησης δεν είναι κολακευτικό. Οι Γερμανοί ξεκίνησαν με ένα 11-0 στο 4' και από εκείνο το σημείο και μετά, με ελάχιστες εξαιρέσεις, είχαν συνεχώς το προβάδισμα στο σκορ σε διψήφιο αριθμό. Ο Ολυμπιακός δεν μπόρεσε να αντιδράσει. 								 Η Μπάμπεργκ είναι αξιόλογη ομάδα, έχει αρχές στο παιχνίδι της, παίζει έξυπνα και ήταν εξαιρετική στο να κυκλοφορεί γρήγορα την μπάλα από την μία πλευρά στην άλλη. Και σε αυτό το ματς είδαμε για ακόμη μία φορά πως ο Ολυμπιακός αντιμετωπίζει πρόβλημα με ομάδες που είναι ιδιαίτερα εύστοχες από την περιφέρεια. Οι Γερμανοί ολοκλήρωσαν την αναμέτρηση μετρώντας 11/29 τρίποντα. Στα προηγούμενα ματς, ο Ερυθρός Αστέρας είχε 2/17 (11.8%), η Ζάλγκιρις 8/24 και η Ούνικς 4/11. Γενικότερα, οι Πειραιώτες πρέπει να το προσέξουν αυτό το κομμάτι, καθώς στο σύνολο, μετά την Γαλατάσαραϊ, είναι η ομάδα που δέχεται τα περισσότερα τρίποντα από τους αντιπάλους της (8/20-40.7%). 								 Ο Ολυμπιακός στην επίθεση παρουσιάστηκε προβλέψιμος. Δεν μπορούσε να βγάλει αρκετές συνεργασίες πικ-εν-ρολ, ήταν άστοχος, αδυνατούσε να βρει σημείο αναφοράς στην επίθεση και αρκετές φορές, ενώ έβγαζε ορισμένες άμυνες, δεν μπορούσε να σταθεί αποτελεσματικός μπροστά. Οι Πειραιώτες δεν είχαν καλή κυκλοφορία της μπάλας και ήταν από τις ελάχιστες φορές που μέτρησαν αρνητικό πρόσημο στον συσχετισμό ασίστ/λάθη (12/13). Με νοκ-άουτ τον Γιώργο Πρίντεζη, τον Ματ Λοτζέσκι να μένει μόλις στους 4 πόντους, τον Έρικ Γκριν να μετρά 8 και τον Βασίλη Σπανούλη (15π) να είναι ο μόνος που διασώθηκε από την λεγόμενη επιθετική τετράδα των Πειραιωτών, σε συνδυασμό και με την αστοχία στα τρίποντα (6/22-27.3%) οι ερυθρόλευκοι δεν μπορούσαν να βρουν ρυθμό στο κομμάτι του σκορ. 								 Οι ερυθρόλευκοι φάνηκαν από το ξεκίνημα να μην έχουν ενέργεια και έχασαν αρκετές προσωπικές μονομαχίες. Βρέθηκαν να κυνηγούν από νωρίς το σκορ, καθώς η Μπάμπεργκ παγείωσε διαφορές σε διψήφιο αριθμό και στο τελευταίο δεκάλεπτο οι Πειραιώτες δεν είχαν δυνάμεις για το κάτι παραπάνω. Ο Ολυμπιακός εμφάνισε αδυναμίες στην άμυνα, καθώς έχανε φάσεις και υπήρχαν αρκετές στιγμές που οι παίκτες του Γιάννη Σφαιρόπουλου ήταν ένα βήμα πίσω από τους αντιπάλους τους. Βέβαια, αν ρίξει κανείς ματιά στην στατιστική των γηπεδούχων, αν και ο Αντρέα Τρινκιέρι έκανε ροτέισον με εφτά παίκτες (Μίλερ, Ραντόσεβιτς, Στρέλνιεκς, Τάις, Ζήσης, Μέλι, Κοζέρ) οι Γερμανοί έδειχναν ανώτεροι και πιο φρέσκοι από την αρχή έως και το τέλος. 								 Ο Ολυμπιακός από αυτό το ματς μπορεί να κρατήσει την για ακόμη μία φορά σταθερή απόδοση του Κώστα Παπανικολάου (τρίτο ματς με διψήφιο αριθμό πόντων στα τελευταία τέσσερα παιχνίδια), ο οποίος δείχνει να έχει βρει ρυθμό και παράλληλα αναμένει ένα επιθετικό αγωνιστικό ξέσπασμα από τον Ιωάννη Παπαπέτρου. Είτε αγωνιστεί κόντρα στην Φενέρμπαχτσε ο Γιώργος Πρίντεζης, είτε όχι, η ομάδα τον χρειάζεται περισσότερο από ποτέ στην φετινή σεζόν. 								 Ο Ολυμπιακός συνηθίζει να αντιδρά με τον καλύτερο δυνατό τρόπο ύστερα από ήττες. Είναι ομάδα που τις αρέσουν οι προκλήσεις, που βρίσκει κίνητρα, που όταν πληγώνεται και μετά έχει ματς στην έδρα της, σχεδόν πάντα την... πληρώνει ο επόμενος αντίπαλος. Ακολουθεί ένα ιδιαίτερα σημαντικό παιχνίδι για τους Πειραιώτες, τόσο από αγωνιστικής πλευράς, από θέμα κατάταξης, όσο και λόγω πρεστίζ, αντιμετωπίζοντας την φιναλίστ της περσινής EuroLeague, την Φενέρμπαχτσε του Κώστα Σλούκα που επιστρέφει για πρώτη φορά στο ΣΕΦ, η οποία έχει και φέτος υψηλές προσδοκίες. Με νίκη οι ερυθρόλευκοι όχι μόνο θα διατηρηθούν στις πρώτες θέσεις, αλλά παράλληλα θα αφήσουν πίσω και έναν εκ των βασικών διεκδικητών για την κατάκτηση των πρώτων τεσσάρων θέσεων. Υπάρχει και εδώ ένα έξτρα πρέπει. 								 Οι Πειραιώτες βρίσκονται στην αναζήτηση γκαρντ για να καλύψουν το κενό του τραυματία Ντάνιελ Χάκετ και το ζητούμενο είναι το καλύτερο δυνατό πακέτο. Παίκτης που να διαθέτει ευρωπαϊκή εμπειρία, με προσιτό κασέ και που η ομάδα του θα είναι διαθέσιμη να τον παραχωρήσει. Σε όποιον παίκτη όμως και αν καταλήξουν οι ερυθρόλευκοι, όσο πιο σύντομα, τόσο το καλύτερο, ώστε ο αθλητής να προσαρμοστεί το συντομότερο δυνατό στην αγωνιστική φιλοσοφία του Ολυμπιακού. Ας μην ξεχνάμε πως τον Γενάρη έρχονται τρία αιώνια ντέρμπι, αλλά και παιχνίδια κόντρα σε Μπαρτσελόνα (εκτός) και Μπασκόνια (εντός). 								  						 OFFICIAL PARTNERS 						 SITE ΤΟΥ ΟΜΙΛΟΥ 24MEDIA ", result2);
	}

}