(ns reagent-material-ui.icons.battery-90
  "Imports @material-ui/icons/Battery90 as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def battery-90 (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M17 5.33C17 4.6 16.4 4 15.67 4H14V2h-4v2H8.33C7.6 4 7 4.6 7 5.33V8h10V5.33z", "fillOpacity" ".3"}) (e "path" #js {"d" "M7 8v12.67C7 21.4 7.6 22 8.33 22h7.33c.74 0 1.34-.6 1.34-1.33V8H7z"}))
                                 "Battery90"))