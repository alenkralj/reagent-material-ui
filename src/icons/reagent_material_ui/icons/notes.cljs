(ns reagent-material-ui.icons.notes
  "Imports @material-ui/icons/Notes as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def notes (create-svg-icon (e "path" #js {"d" "M3 18h12v-2H3v2zM3 6v2h18V6H3zm0 7h18v-2H3v2z"})
                            "Notes"))
