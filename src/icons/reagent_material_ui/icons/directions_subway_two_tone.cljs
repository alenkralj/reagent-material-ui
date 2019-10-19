(ns reagent-material-ui.icons.directions-subway-two-tone
  "Imports @material-ui/icons/DirectionsSubwayTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def directions-subway-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M12 4c-3.51 0-4.96.48-5.57 1h11.23c-.54-.54-1.95-1-5.66-1zM6 15.5c0 .83.67 1.5 1.5 1.5h9c.83 0 1.5-.67 1.5-1.5V12H6v3.5zm9.5-2.5c.83 0 1.5.67 1.5 1.5s-.67 1.5-1.5 1.5-1.5-.67-1.5-1.5.67-1.5 1.5-1.5zm-7 0c.83 0 1.5.67 1.5 1.5S9.33 16 8.5 16 7 15.33 7 14.5 7.67 13 8.5 13z", "opacity" ".3"}) (e "path" #js {"d" "M12 2c-4 0-8 .5-8 4v9.5C4 17.43 5.57 19 7.5 19L6 20.5v.5h12v-.5L16.5 19c1.93 0 3.5-1.57 3.5-3.5V6c0-3.5-3.58-4-8-4zm0 2c3.71 0 5.12.46 5.66 1H6.43c.61-.52 2.06-1 5.57-1zM6 7h5v3H6V7zm12 8.5c0 .83-.67 1.5-1.5 1.5h-9c-.83 0-1.5-.67-1.5-1.5V12h12v3.5zm0-5.5h-5V7h5v3z"}) (e "circle" #js {"cy" "14.5", "r" "1.5", "cx" "8.5"}) (e "circle" #js {"cy" "14.5", "r" "1.5", "cx" "15.5"}))
                                                 "DirectionsSubwayTwoTone"))