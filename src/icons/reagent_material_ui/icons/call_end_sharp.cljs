(ns reagent-material-ui.icons.call-end-sharp
  "Imports @material-ui/icons/CallEndSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def call-end-sharp (create-svg-icon (e "path" #js {"d" "M3.68 16.07l3.92-3.11V9.59c2.85-.93 5.94-.93 8.8 0v3.38l3.91 3.1L24 12.39c-6.41-7.19-17.59-7.19-24 0l3.68 3.68z"})
                                     "CallEndSharp"))
