(ns reagent-material-ui.core.button-group
  "Imports @material-ui/core/ButtonGroup as a Reagent component.
   Original documentation is at https://material-ui.com/api/button-group/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def button-group (adapt-react-class (.-ButtonGroup js/MaterialUI) "mui-button-group"))
