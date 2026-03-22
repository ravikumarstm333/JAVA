const express = require("express");
const cors = require("cors");

const app = express();
const PORT = 3000;

app.use(cors());
app.use(express.json());

app.get("/data", (req, res) => {
  res.json({ message: "Hello Ravi" });
});

app.post("/data", (req, res) => {
  const { name } = req.body;
  if(!name){
    return res.json({
      status:"error", 
      message:"Enter name "
    })
  }
  res.json({
    status: "success",
    message: `Hello ${name}`,
  });
});

app.listen(PORT,()=>{
  console.log(`Sever is running on ${PORT}`)
})