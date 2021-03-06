(ns reagent-material-ui.icons.hotel-two-tone
  "Imports @material-ui/icons/HotelTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def hotel-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M19 9h-6v6h8v-4c0-1.1-.9-2-2-2z", "opacity" ".3"}) (e "circle" #js {"cy" "11", "r" "1", "cx" "7", "opacity" ".3"}) (e "path" #js {"d" "M4 11c0 1.66 1.34 3 3 3s3-1.34 3-3-1.34-3-3-3-3 1.34-3 3zm4 0c0 .55-.45 1-1 1s-1-.45-1-1 .45-1 1-1 1 .45 1 1zm11-4h-8v8H3V5H1v15h2v-3h18v3h2v-9c0-2.21-1.79-4-4-4zm2 8h-8V9h6c1.1 0 2 .9 2 2v4z"}))
                                     "HotelTwoTone"))
