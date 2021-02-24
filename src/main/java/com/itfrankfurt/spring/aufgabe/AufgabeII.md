# Aufgabe Spring II
Erstelle ein neues Package namens Service. Erstelle dabei ein UserService-Interface, dass folgende Methoden anbietet:
1. Eine Methode die einen Vor- und Nachnamen nimmt und einen neuen User mit einer zufälligen Id erstellt.
2. Eine Methode die alle User zurückgibt
3. Eine Methode die einen User mit einer entsprechenden Id zurückgibt. (Ein Optional)
4. Eine Methode die eine Id und einen Lastname nimmt und diesen für den User ändert.
5. Eine Methode die einen User löscht.

Implementiere diesen Service und nutze dabei eine ArrayList als interne Datenstruktur.
Geh in deinen Controller und Injecte dir den Service. Entferne dann die Datenbank im Controller und ersetze
sie durch die entsprechenden Aufrufe an den Service.

Erstelle ein neues Paket config. Erstelle dort eine UserConfig-Klasse. Diese soll folgende Bean anbieten:
public List<User> initialUsers();

Erstelle darin ein paar Testnutzer. Injecte diese Bean in deine UserService-Implementierung und
füge die Werte im Konstruktor zu deiner internen Datenbank-Liste hinzu.

Erstelle nun eine zweite Service-Implementierung, die eine LinkedList als interne Datenstruktur nutzt.
Nutze zwei verschiedene Wege den daraus resultierenden Fehler zu beheben:
- @Qualifier
- @Primary
