(ns reagent-material-ui.icons.exposure-two-tone
  "Imports @material-ui/icons/ExposureTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def exposure-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M19 19V5L5 19h14zm-4.5-4.5v-2H16v2h2V16h-2v2h-1.5v-2h-2v-1.5h2z", "opacity" ".3"}) (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zM6 7h5v1.5H6V7zm13 12H5L19 5v14zm-4.5-3v2H16v-2h2v-1.5h-2v-2h-1.5v2h-2V16z"}))
                                        "ExposureTwoTone"))
