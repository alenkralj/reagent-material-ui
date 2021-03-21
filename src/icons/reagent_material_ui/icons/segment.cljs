(ns reagent-material-ui.icons.segment
  "Imports @material-ui/icons/Segment as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def segment (create-svg-icon (e "path" #js {"d" "M9 18h12v-2H9v2zM3 6v2h18V6H3zm6 7h12v-2H9v2z"})
                              "Segment"))