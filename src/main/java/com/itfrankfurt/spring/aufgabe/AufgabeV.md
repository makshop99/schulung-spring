# Aufgabe Spring V
Erstelle eine Klasse Human mit folgenden Feldern und den notwendigen Standardmethoden:

privater Long id;
private String name;
private int height;
private String job;


Gegegeben sein folgendes Controller-Grundgerüst:
````java
@RestController
@RequestMapping("/api")
public class HumanController {

    @GetMapping("/humans")
    public List<Human> getAllHumans() {
        return null;
    }

    @PostMapping("/human")
    public Human createHuman(@RequestBody Human human) {
       return null;
    }

    @DeleteMapping("/human/{id}")
    public void deleteHuman(@PathVariable Long id) {

    }

    @GetMapping("/human/{id}")
    public ResponseEntity<Human> findAnimalById(@PathVariable Long id) {
      return null;
    }

    @GetMapping("/human/{name}/{height}")
    public ResponseEntity<Human> findHumanByNameAndBiggerThenHeight(@PathVariable String name, @PathVariable int height) {
        // Gibt einen Menschen zurück, der den Namen 'name' hat und größer ist als 'height'
        return null;
    }

    @GetMapping("/human/{job}")
    public List<Human> findAllHumansWithJobOrderedByName(@PathVariable String job) {
        // Gibt alle Menschen mit einer entsprechenden Jobbeschreibung zurück und sortiert diese nach ihrem Namen
        return null;
    }
}
````
Es soll nun ein Repository erstellt werden, dass die Aufrufe des Controllers mit der Datenbank verbindet.
Geh dafür in folgenden Schritten vor:
1. Kopiere die notwendigen Abhängigkeiten in deine pom.xml
2. Aktiviere in der application.properties die h2-console und setze die richtige Datasource
3. Starte deine Anwendung einmal und schaue, ob alles noch läuft. Überprüfe auch, dass du die
h2-console unter localhost:8080/h2-console erreichen kannst.
4. Erstelle ein Repository-Interface. Überlege dir, welche Methoden du benötigst, um die Anforderungen im HumanController zu erfüllen.
5. Nutze Dependency-Injection um dir dein Repository in deinen HumanController zu laden.
6. Implementiere die Methodenbodys im Controller
7. Teste deine Implementierung über Postman. Schau dir auch die befüllte Datenbank über die h2-console an.
