(ns reagent-material-ui.icons.filter-none-sharp
  "Imports @material-ui/icons/FilterNoneSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def filter-none-sharp (create-svg-icon (e "path" #js {"d" "M3 5H1v18h18v-2H3V5zm20-4H5v18h18V1zm-2 16H7V3h14v14z"})
                                        "FilterNoneSharp"))
