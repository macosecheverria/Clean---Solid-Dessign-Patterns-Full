(() => {
  const filesToEvaluate = [
    { id: 1, toEliminated: false },
    { id: 2,  toEliminated: false },
    { id: 3,  toEliminated: false },
    { id: 4,  toEliminated: false },
    { id: 5,  toEliminated: false },
    { id: 6,  toEliminated: false },
    { id: 7,  toEliminated: false },
  ];

  const fileToDeletes = filesToEvaluate.map(file => file.toEliminated);

  // Malos
  class AbstractUser{};
  class UserMixin{};
  class UserImplementation {};
  interface IUser {};

  //Mejor
  class User {}
  interface User{}

  const today: Date = new Date();
  const elapsedTimeInDays: number = 23;

  const numberOfFilesInDirectory: number = 33;

  const firstName: string =  "marcos";
  const lastName: string = "Echeverria";

  const daySinceLastModification: number = 12;
  const maxClassesPerStudes: number = 6

})();
