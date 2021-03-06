(ns reagent-material-ui.icons.keyboard-arrow-down-outlined
  "Imports @material-ui/icons/KeyboardArrowDownOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def keyboard-arrow-down-outlined (create-svg-icon (e "path" #js {"d" "M7.41 8.59L12 13.17l4.59-4.58L18 10l-6 6-6-6 1.41-1.41z"})
                                                   "KeyboardArrowDownOutlined"))
