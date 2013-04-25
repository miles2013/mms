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
    1.) links unter github auf euren Nickname klicken
    2.) Sicherstellen, dass in eurem Eclipse-Workspace noch kein Verzeichnis "mms" existiert
    3.) das Repository <nickname>/mms klonen

  - Einstellungen für Pulls von Maiks Repository
    1.) Auf den Desktop wechseln
    2.) "Git Shell" starten
    3.) folgendes eintippen:

      cd mms
      git remote add --track master mallgoewer git://github.com/user1391/mms.git

  - Euer Repository mit dem von Maik up-to-date halten
    1.) "Git Shell" starten
    2.) eintippen: git pull --rebase mallgoewer master:master
    3.) Macht das immer bevor ihr Änderungen von euch committet und bevor ihr eure Änderungen hochladet

  - Änderungen committen und in euer Repo hochladen
    1.) In der "Github" Software bei links local auf das Repo klicken
    2.) Auf den blaun Pfeil beim Repo klicken
    3.) Ihr seht hier alle Änderungen seit dem letzen commit
    4.) Im Feld Commit Message einen sprechenden Titel und unter Extended eine kurze Beschreibung einfügen
    5.) Fasst die commits bitte thematisch zusammen. Ihr könnt links über die Haken auswählen, welche Änderungen zu einem commit gehören sollen
    6.) Auf commit klicken
    7.) Durch klick auf publish werden die Änderungen in euer repository hochgeladen

  - Für weiterführendes bitte hier lesen:
      http://try.github.io/levels/1/challenges/1
      http://git-scm.com/doc