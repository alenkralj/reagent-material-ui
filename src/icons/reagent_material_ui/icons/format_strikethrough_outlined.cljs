(ns reagent-material-ui.icons.format-strikethrough-outlined
  "Imports @material-ui/icons/FormatStrikethroughOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-strikethrough-outlined (create-svg-icon (e "path" #js {"d" "M10 19h4v-3h-4v3zM5 4v3h5v3h4V7h5V4H5zM3 14h18v-2H3v2z"})
                                                    "FormatStrikethroughOutlined"))
