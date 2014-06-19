(ns dachshund.core
  (:gen-class)
  (:require [quil.core :as q]))

(ns dachshund.core
  (:gen-class)
  (:require [quil.core :as q]))

(defn setup []
  (q/smooth)
  (q/stroke 220 30 30)
  (q/stroke-weight 2)
  (q/background 255 255 255)
  (q/frame-rate 10))

(defn draw []
  (q/bezier 180 280 183 268 186 256 189 244)
  (q/bezier 191 244 290 244 300 230 339 245)
  (q/bezier 340 246 350 290 360 300 355 210)
  (q/bezier 353 210 370 207 380 196 375 193)
  (q/bezier 375 193 310 220 190 220 164 205)
  (q/bezier 164 205 135 194 135 265 153 275)
  (q/bezier 153 275 168 275 170 180 150 190)
  (q/bezier 149 190 122 214 142 204 85  240)
  (q/bezier 86  240 100 247 125 233 140 238))

(q/defsketch dachshund
  :title "Picasso's dachschund"
  :setup setup
  :draw draw
  :size [400 400])
