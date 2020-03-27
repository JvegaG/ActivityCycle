# ActivityCycle
Este programa se encarga de revisar como funciona el ciclo de vida de una Activity por medio de mensajes en el Logcat de AndroidStudio, esto ayuda en gran medida al programador a ver el comportamiento en una activity, como es que se dan las llamadas a los metodos que esta tiene durante su ciclo, ya sea cuando se esta ejecutanto esta aplicación, cuando se usa otra aplicación y se deja ejecutando esta en segundo plano, o cuando se cierra la aplicación. Teniendo claro el comportamiento del ciclo de vida de una Activity nos ayudará a desarrollar aplicaciones mas sólidas y eficientes.

Las aplicaciones de android estan basadas en Activities, esta clase asocia el comportamiento de una pantalla (o varias con el uso de fragments) con la interfaz visual que esta contenido en el archivo xml. 
![alt diagrama del ciclo de vida de una Activity. (fuente: https://developer.android.com/guide/components/activities/activity-lifecycle)](https://github.com/JvegaG/ActivityCycle/blob/master/activity_lifecycle.png)

Un buen uso de las llamadas que tiene la activity harán que tu aplicación:
  - No falle si el usuario recibe una llamada telefónica o cambia a otra app mientras usa la tuya.
  - No consuma recursos valiosos del sistema cuando el usuario no la use de forma activa.
  - No pierda el progreso del usuario si este abandona tu app y regresa a ella posteriormente.
  - No falle ni pierda el progreso del usuario cuando se gire la pantalla entre la orientación horizontal y la vertical.
  
Para mas información visitar la página https://developer.android.com/guide/components/activities/activity-lifecycle
