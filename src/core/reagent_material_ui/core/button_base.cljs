(ns reagent-material-ui.core.button-base
  "Imports @material-ui/core/ButtonBase as a Reagent component.
   Original documentation is at https://material-ui.com/api/button-base/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def button-base (adapt-react-class (.-ButtonBase js/MaterialUI) "mui-button-base"))
