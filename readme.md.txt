# Produktų Linijos Reprezentacinis Puslapis su Galimybe Juos Įsigyti

Šis projektas yra produktų linijos puslapis, sukurtas naudojant React ir Spring Boot (Java). Puslapis leidžia peržiūrėti, pasirinkti ir pridėti produktus į krepšelį bei atlikti pirkimą.

## Projekto Struktūra

- **Front-end**: React
  - `App.js`: pagrindinė aplikacijos dalis.
  - `ProductList.js`: rodo produktų sąrašą.
  - `Footer.js`: puslapio apačios komponentas.
  - `Cart.js`: krepšelio komponentas.
  - **CSS Failai**: Dizainas ir stilių apibrėžimas.

- **Back-end**: Spring Boot
  - `ProductController.java`: API endpoint'ų valdymas produktams.
  - `CartController.java`: valdo produktų pridėjimą į krepšelį.
  - `JwtUtils.java`: atsakingas už autentiškumo patvirtinimą.
  - `WebSecurityConfig.java`: saugumo konfigūracija.
  - `UserService.java`: naudotojų valdymas ir saugumo patvirtinimas.

## Funkcijos

- **Produktų sąrašas**: vartotojas gali peržiūrėti galimus produktus.
- **Krepšelio funkcija**: vartotojai gali pridėti produktus į krepšelį.
- **Vieno produkto pridėjimas**: vienu metu į krepšelį gali būti pridėtas tik vienas produktas.
- **Pirkimo mygtukas**: atlikus pirkimą, krepšelis išvalomas ir galima pradėti naują pasirinkimą.
- **Autorizacija ir autentifikacija**: naudojama JWT autentifikacija saugumui užtikrinti.

## Projekto Paleidimas

### Prieš Pradžią

Įsitikinkite, kad turite įdiegtas šias priklausomybes:

- **Node.js**: skirtas React projektui.
- **Maven/Gradle**: skirtas Java (Spring Boot) projektui.
- **MySQL**: naudojama kaip duomenų bazė.

### Front-end (React)

1. Eikite į `frontend` aplanką.
2. Įdiekite priklausomybes:
   ```bash
   npm install
