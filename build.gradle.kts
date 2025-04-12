tasks.register("clean", Delete::class) {
    delete(layout.buildDirectory)
}
