# encoding: UTF-8
# This file is auto-generated from the current state of the database. Instead
# of editing this file, please use the migrations feature of Active Record to
# incrementally modify your database, and then regenerate this schema definition.
#
# Note that this schema.rb definition is the authoritative source for your
# database schema. If you need to create the application database on another
# system, you should be using db:schema:load, not running all the migrations
# from scratch. The latter is a flawed and unsustainable approach (the more migrations
# you'll amass, the slower it'll run and the greater likelihood for issues).
#
# It's strongly recommended that you check this file into your version control system.

ActiveRecord::Schema.define(version: 20140403040220) do

  create_table "groups", force: true do |t|
    t.string   "name"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

  create_table "matches", force: true do |t|
    t.date     "game_date"
    t.integer  "stage"
    t.integer  "status"
    t.integer  "local_team_id_id"
    t.integer  "visitor_team_id_id"
    t.integer  "score"
    t.integer  "winer_id_id"
    t.integer  "loser_id_id"
    t.boolean  "tie"
    t.integer  "group_id_id"
    t.integer  "stadium_id_id"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

  add_index "matches", ["group_id_id"], name: "index_matches_on_group_id_id"
  add_index "matches", ["local_team_id_id"], name: "index_matches_on_local_team_id_id"
  add_index "matches", ["loser_id_id"], name: "index_matches_on_loser_id_id"
  add_index "matches", ["stadium_id_id"], name: "index_matches_on_stadium_id_id"
  add_index "matches", ["visitor_team_id_id"], name: "index_matches_on_visitor_team_id_id"
  add_index "matches", ["winer_id_id"], name: "index_matches_on_winer_id_id"

  create_table "stadia", force: true do |t|
    t.string   "name"
    t.string   "city"
    t.date     "construction_date"
    t.integer  "max_capacity"
    t.string   "photo"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

  create_table "teams", force: true do |t|
    t.string   "name"
    t.string   "coach"
    t.string   "flag"
    t.string   "uniform"
    t.text     "history"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

end
