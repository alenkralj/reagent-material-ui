(ns reagent-material-ui.icons.signal-cellular-connected-no-internet-1-bar-two-tone
  "Imports @material-ui/icons/SignalCellularConnectedNoInternet1BarTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def signal-cellular-connected-no-internet-1-bar-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M22 8V2L2 22h16V8h4z", "fillOpacity" ".3"}) (e "path" #js {"d" "M20 10v8h2v-8h-2zm-8 12V12L2 22h10zm8 0h2v-2h-2v2z"}))
                                                                           "SignalCellularConnectedNoInternet1BarTwoTone"))
