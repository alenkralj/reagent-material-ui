(ns reagent-material-ui.icons.vertical-align-bottom-outlined
  "Imports @material-ui/icons/VerticalAlignBottomOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def vertical-align-bottom-outlined (create-svg-icon (e "path" #js {"d" "M16 13h-3V3h-2v10H8l4 4 4-4zM4 19v2h16v-2H4z"})
                                                     "VerticalAlignBottomOutlined"))
