(ns reagent-material-ui.icons.restore-from-trash-outlined
  "Imports @material-ui/icons/RestoreFromTrashOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def restore-from-trash-outlined (create-svg-icon (e "path" #js {"d" "M15.5 4l-1-1h-5l-1 1H5v2h14V4zM6 19c0 1.1.9 2 2 2h8c1.1 0 2-.9 2-2V7H6v12zm2-5V9h8v10H8v-5zm2 4h4v-4h2l-4-4-4 4h2z"})
                                                  "RestoreFromTrashOutlined"))
