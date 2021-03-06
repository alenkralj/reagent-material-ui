(ns reagent-material-ui.core.input-base
  "Imports @material-ui/core/InputBase as a Reagent component.
   Original documentation is at https://material-ui.com/api/input-base/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def input-base (adapt-react-class (.-InputBase js/MaterialUI) "mui-input-base"))
