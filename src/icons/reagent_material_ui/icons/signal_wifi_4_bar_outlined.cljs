(ns reagent-material-ui.icons.signal-wifi-4-bar-outlined
  "Imports @material-ui/icons/SignalWifi4BarOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def signal-wifi-4-bar-outlined (create-svg-icon (e "path" #js {"d" "M12.01 21.49L23.64 7c-.45-.34-4.93-4-11.64-4C5.28 3 .81 6.66.36 7l11.63 14.49.01.01.01-.01z"})
                                                 "SignalWifi4BarOutlined"))
