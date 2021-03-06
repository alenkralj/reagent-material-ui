(ns reagent-material-ui.icons.tablet-mac-two-tone
  "Imports @material-ui/icons/TabletMacTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def tablet-mac-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M4 3h15v16H4z", "opacity" ".3"}) (e "path" #js {"d" "M18.5 0h-14C3.12 0 2 1.12 2 2.5v19C2 22.88 3.12 24 4.5 24h14c1.38 0 2.5-1.12 2.5-2.5v-19C21 1.12 19.88 0 18.5 0zm-7 23c-.83 0-1.5-.67-1.5-1.5s.67-1.5 1.5-1.5 1.5.67 1.5 1.5-.67 1.5-1.5 1.5zm7.5-4H4V3h15v16z"}))
                                          "TabletMacTwoTone"))
