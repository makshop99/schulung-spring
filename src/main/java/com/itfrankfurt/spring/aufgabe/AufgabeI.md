# Aufgabe Spring I

## Teil I

Erstelle ein neues Spring-Projekt über den Spring-Initializer. Als Abhängigkeit benötigen wir Spring Web.

Zusätzlich soll ein Package controller angelegt werden. Dieses beinhaltet einen RestController namens CalculatorController.

Der RestController soll folgende Schnittstellen anbieten:

GET /add/{zahl1}/{zahl2} -> Liefert den addierten Wert der beiden Zahlen zurück

GET /subtract/{zahl1}/{zahl2} -> Liefert den subtrahierten Wert der beiden Zahlen zurück

GET /power/{basis}?exponent={exponent} -> Liefert basis ^ exponent (Für die passend Funktion mal in der Klasse Math nachschauen). Es werden hier double Werte und keine ints benötigt.

GET /random/{limit} -> Erstellt eine Zufallszahl im Bereich zwischen 0 und dem limit und liefert diese zurück


## Teil II
Erstelle ein neues Package namens Entity. Darin soll eine neue Klasse User mit folgenden Feldern erstellt werden:
Long id
String firstName
String lastName

Erstelle auch einen Defaultkonstruktor, einen AllArgs-Konstruktor und Getter und Setter.

Erstelle einen UserRestController.

Erstelle hier eine Liste, die als simulierte Datenbank fungiert. Die Liste wird im Konstruktor mit Testdaten befüllt.
Achte darauf, dass die Id jedes Objekts eindeutig ist.

Anschließend sollen folgende HTTP-Requests über Postman möglich sein:
GET /user/{id} -> Liefert einen User mit der entsprechenden id zurück, ansonsten einen 404er Fehler
GET /users -> Liefert alle User zurück
POST /user?firstName={firstName}&lastName={lastName} -> Legt einen neuen User an. Generiere als Id eine Zufallszahl. Der Wertebereich sollte groß genug sein, um eine Kollision zu vermeiden.
PUT /user/{id}/{lastname} -> Ändert den Nachnamen des Users mit der entsprechenden Id. Ansonsten soll ein 400er Fehler zurückkommen.
DELETE /user/{id} -> Löscht den entsprechenden User aus der Liste

