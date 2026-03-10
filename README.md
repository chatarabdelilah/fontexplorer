# Analyse

## Productvisie

### Product beschrijving

Fonts voor developers en designers die geinteresseerd zijn in typografie. Om het web en applicaties mooier te maken.

### User story mapping

<img width="1802" height="1136" alt="image" src="https://github.com/user-attachments/assets/7023f209-55bc-465e-97d0-31e23da52959" />

#### Acceptance criteria

1. Als bezoeker wil ik alle fonts zien.
   - List pagina toont alle niet-gearchiveerde fonts.
   - Elk font toont naam en categorie.
   - De pagina is bereikbaar zonder in te loggen.
   - lk font heeft een link naar detail pagina.
   - Geen fonts = melding
2. Als bezoeker wil ik detail pagina zien van een font.
   - Detail pagina toont naam, categorie, designer, jaar, licentie en stijlen.
   - Font bestaat niet of gearchiveerd = foutmelding op pagina (geen redirect).
   - Pagina bevat prev/next links
3. Als admin wil ik een nieuw font aanmaken via een formulier.
   - Formulier enkel bereikbaar voor admins.
   - Formulier bevat ```<select>``` met designers uit db.
   - Verplichte velden tonen foutmelding als ze leeg zijn (geen redirect, bvb. rode border).
   - Nieuwe font verschijnt meteen in font list.

### Personas

***Bezoeker***
* Naam: Lars Mertens
* Leeftijd: 24
* Beroep: Freelance front-end developer
* Woonplaats: Gent
* Bio: Lars studeert grafische en digitale media af en bouwt nu zijn eerste freelance projecten op.
Hij maakt websites voor lokale zelfstandigen en kleine bedrijven.
Hij wil dat zijn sites er professioneel uitzien maar heeft geen formele achtergrond in typografie.

#### Doelen

* Snel font vinden dat past voor een specifiek project.
* Weten welke fonts vrij gebruik licentie hebben.
* CSS-code direct kopieren.

#### Frustraties

* Google Fonts is overweldigend, te veel keuze, te weinig context.
* Hij weet niet welke fonts goed combineren.
* Hij verspilt tijd aan zoeken in plaats van developen.

#### Relatie
> Zoekt, filtert en past fonts toe. Hij heeft een account om favorieten bij te houden per project.

<br/>
<br/>
<br/>

***Gebruiker***
* Naam: Nathalie Claes
* Leeftijd: 38
* Beroep: Grafisch ontwerper bij een communicatiebureau
* Woonplaats: Antwerpen
* Bio: Nathalie werkt al 12 jaar als grafisch ontwerper.
Ze kent de klassiekers (Helvetica, Garamond, Futura) maar wil bewust nieuwe en minder bekende fonts ontdekken.
Ze heeft gevoel voor typografische kwaliteit en let sterk op details zoals letterspatiëring en x-hoogte.

#### Doelen

* Nieuwe fonts ontdekken.
* Fonts opslaan in collecties per project/klant.
* Snel beoordelen of een font geschikt is.

#### Frustraties

* Veel fontwebsites tonen alleen standaardtekst in de preview, niet eigen tekst.
* Licentie informatie onduidelijk of verstopt.
* Ze wilt collecties maken maar geen zin in complexe tools.

#### Relatie
> Filtert intensief, let op designer en jaar, en wilt fonts bewaren per klant.

<br/>
<br/>
<br/>

***Bezoeker***
* Naam: Abdelilah Salim Chatar
* Leeftijd: 20
* Beroep: Student IT Programmeren (1e jaar)
* Woonplaats: Antwerpen
* Bio: Abdelilah begint net aan zijn project en ontdekt typografie ald discipline.
Hij kent amper het verschil tussen serif en sans-serif maar in enthousiast en visueel ingesteld.
Hij zoekt vooral inspiratie en wil leren door te kijken.

#### Doelen

* Begrijpen wat de verschillen zijn tussen lettertypes.
* Inspiratie opdoen voor schoolopdrachten.
* Zien hoe een font eruitziet in een echte context.

#### Frustraties

* Vakjargon dat hij niet begrijpt.
* Te veel technische info.
* Previews die klein of saai zijn.

#### Relatie
> Browst zonder account, kijkt naar de lijst en detail paginas, klikt door op designers.

<br/>
<br/>
<br/>

***Admin***
* Naam: Vera Peteghem
* Leeftijd: 45
* Beroep: Typografie redacteur
* Woonplaats: Leuven
* Bio: Vera beheert het fontaanbod van de app.
Ze heeft een achtergrond in grafische vormgeving en is verantwoordelijk voor de kwaliteit en volledigheid van de font-database.
Ze voegt nieuwe fonts toe, koppelt ze aan de juiste designer, en zorgt dat alle informatie correct en up-to-date is.

#### Doelen

* Snel nieuwe fonts toevoegen.
* Verouderde of foutieve informatie corrigeren.
* Fonts die niet meer relevant zijn archiveren zonder data te verliezen.

#### Frustraties

* Foutieve koppelingen tussen fonts en designers zijn moeilijk terug te vinden.
* Ze wilt geen technische kennis nodig hebben om de database te beheren.
* Dubbele of tegenstrijdige informatie in het systeem.

#### Relatie
> Gebruikt admin gedeelte, maakt fonts aan, bewerkt ze, archiveert ze en beheert designers.

## Conceptueel model

### Stap 1 - Probleem definieren

Q: Wat modelleren we?
<br/>
A: Een platform waar mensen lettertypes kunnen ontdekken en bewaren.

Doelen:
* Fonts vindbaar maken.
* Fonts koppelen aan hun maker.
* Gebruikers toelaten fonts te bewaren als favoriet.

### Stap 2 - Kernconcepten identificeren.

Concept:

Font-------| Waarom? -> Het centrale object van het platform. <br/>
Designer--| Waarom? -> De persoon die een font gemaakt heeft. <br/>
Gebruiker-| Waarom? -> Iemand die fonts ontdekt en bewaard. <br/>

Categorie, stijlen, tekensystemen -> weglaten op dit niveau, zijn extras.

### Stap 3 - Relaties bepalen

* Een designer maakt 1 of meerdere fonts.
* Een gebruiker bewaart meerdere fonts als favoriet.
* Een font kan door meerdere gebruikers bewaard worden.

### Stap 4 - Visualisatie

<img width="314" height="388" alt="image" src="https://github.com/user-attachments/assets/77b4534f-9c0b-4d64-a60c-b4b54bd4a7ec" />

## Functionele analyse

### Wireframes

### Use case diagram

### Activity diagram

### Class diagram
