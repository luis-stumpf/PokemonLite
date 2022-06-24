
FROM hseeberger/scala-sbt:17.0.2_1.6.2_3.1.1
ENV DISPLAY=host.docker.internal:0.0
RUN apt-get update && apt-get install -y libxrender1 libxtst6 libxi6 libgl1-mesa-glx libgtk-3-0 openjfx libgl1-mesa-dri libgl1-mesa-dev libcanberra-gtk-module libcanberra-gtk3-module default-jdk
WORKDIR /PokemonLite
ADD . /PokemonLite
RUN chmod +x /PokemonLite/run.sh
RUN ["sbt", "compile", "&&", "sbt", "test"]
CMD ["sbt", "run"]