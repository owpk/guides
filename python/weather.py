#!/usr/bin/env python
import pyowm
import math

owm = pyowm.OWM('65337c282b579ace6cbba6527bd43f12')
mgr = owm.weather_manager()

# Search for current weather in London (Great Britain) and get details
place = input("City?: ")
observation = mgr.weather_at_place(place)
w = observation.weather

# w.detailed_status         # 'clouds'
# w.wind()                  # {'speed': 4.6, 'deg': 330}
# w.humidity                # 87
temp = w.temperature('celsius')["temp"]  # {'temp_max': 10.5, 'temp': 9.7, 'temp_min': 9.0}
print(temp)
# w.rain                    # {}
# w.heat_index              # None
# w.clouds                  # 75

# Will it be clear tomorrow at this time in Milan (Italy) ?
