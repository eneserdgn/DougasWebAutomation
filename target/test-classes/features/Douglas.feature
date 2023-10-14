Feature: Douglas

  Scenario Outline: Interview
    Given user is on the Home Page
    Given handle the cookie consent
    When click on "Parfume" tab
    When select on "<marke>" Marke on Products Page
    When select on "<producart>" Producart on Products Page
    When select on "<geschenkfur>" Geschenk fur on Products Page
    When select on "<furWen>" Fur Wen on Products Page
    Examples:
      | marke               | producart     | geschenkfur | furWen |
      | Abercrombie & Fitch | Eau de Parfum | Geburtstag  | Unisex |