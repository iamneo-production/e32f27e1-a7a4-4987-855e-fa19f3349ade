module.exports = {
  content: ["./src/**/*.{html,ts}"],
  theme: {
    extend: {
      dropShadow: {
        "3xl": "0 35px 35px rgba(0, 0, 0, 0.25)",
        "5xl": "0 50px 50px rgba(0,0,0,0.25)",
      },
      fontFamily: {
        dongle: ["Dongle"],
        serifpro: ["Source-Seriff-Pro"],
      },
      animation: {
        blob: "blob 7s infinite",
      },
      keyframes: {
        blob: {
          "0%": {
            transform: "translate(0px,0px) scale(1)",
          },
          "33%": {
            transform: "translate(30px,-50px) scale(1.1) ",
          },
          "66%": {
            transform: "translate(-20px,20px) scale(0.9)",
          },
          "100%": {
            transform: "translate(0px,0px) scale(1)",
          },
        },
      },
    },
  },
  plugins: [],
};
