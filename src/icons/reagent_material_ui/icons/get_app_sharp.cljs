(ns reagent-material-ui.icons.get-app-sharp
  "Imports @material-ui/icons/GetAppSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def get-app-sharp (create-svg-icon (e "path" #js {"d" "M19 9h-4V3H9v6H5l7 7 7-7zM5 18v2h14v-2H5z"})
                                    "GetAppSharp"))
