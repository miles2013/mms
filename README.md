Voraussetzungen fuer die GUI-Entwicklung:

  - Eclipse in irgendeiner Version
  - Vaadin 7


Kleines Git-HowTo:

  - Herunterladen & installieren
    1.) Github herunterladen https://help.github.com/articles/set-up-git
    2.) Mit den Anmeldedaten einloggen
 
  - Programmeinstellungen anpassen
    1.) tools -> options...
    2.) Bei default storage directory den Eclipse-Workspace hinzufügen
    3.) default shell -> Git Bash
    4.) Bei configure git sollten Name und uni-email eingetragen sein, wenn nicht, nachholen

  - Remote Repository auf die Platte klonen
    1.) links unter github auf user1391 klicken
    2.) Sicherstellen, dass in eurem Eclipse-Workspace noch kein Verzeichnis "mms" existiert
    3.) das Repository user1391/mms klonen       

  - Einen Branch zur Entwicklung erstellen
    1.) Branch erstellen: git branch <branchname>
    2.) In Branch wechseln: git checkout <branchname>
    3.) Aenderungen machen
    4.) Nach dem commit, Aenderungen die im Master inzwischen gemacht wurden, in <Branchname> "einbauen",
        Voraussetzung ist, dass der master aktuell ist!: git rebase master
    5.) git checkout master
    6.) git merge --no-ff <branchname>


  - Euer lokales Repository mit dem von Maik up-to-date halten
    1.) "Git Shell" starten
    2.) Sicherstellen, dass master aktuell ist: git checkout master
                                                git pull --rebase
    3.) eintippen: git checkout master
    				git pull --rebase
    4.) Macht das immer bevor ihr Aenderungen von euch committet und bevor ihr eure Aenderungen hochladet

  - Aenderungen committen und in euer Repo hochladen
    1.) In der "Github" Software bei links local auf das Repo klicken
    2.) Auf den blaun Pfeil beim Repo klicken
    3.) Ihr seht hier alle Aenderungen seit dem letzen commit
    4.) Im Feld Commit Message einen sprechenden Titel und unter Extended eine kurze Beschreibung einfuegen
    5.) Fasst die commits bitte thematisch zusammen. Ihr koennt links ueber die Haken auswaehlen, welche Aenderungen zu einem commit gehoeren sollen
    6.) Auf commit klicken
    7.) git push origin master

  - Fuer weiterfuehrendes bitte hier lesen:
      http://try.github.io/levels/1/challenges/1
      http://git-scm.com/doc

  - Projekttagebuch Online
      https://docs.google.com/spreadsheet/ccc?key=0AqhpFLFdA4p7dFdLaUtSRjlsUkRJZkhxRi1peUVYTHc#gid=0
