(ns reagent-material-ui.icons.bubble-chart
  "Imports @material-ui/icons/BubbleChart as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def bubble-chart (create-svg-icon (e (.-Fragment js/React) nil (e "circle" #js {"cy" "14.4", "r" "3.2", "cx" "7.2"}) (e "circle" #js {"cy" "18", "r" "2", "cx" "14.8"}) (e "circle" #js {"cy" "8.8", "r" "4.8", "cx" "15.2"}))
                                   "BubbleChart"))
